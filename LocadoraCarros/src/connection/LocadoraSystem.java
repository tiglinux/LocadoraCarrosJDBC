package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entity.Carro;
import exception.ErroLetraException;

/**
 * 
 * @author tiago
 * @version 1.0
 * 
 * Github: www.github.com/tiglinux
 * 
 * Application class for CRUD of Cars from LocadoraSystem of my own
 */

public class LocadoraSystem {

	public static void main(String[] args) throws SQLException {

		showMenu();

	}

	private static void showMenu() {
		Connection connection = FabricaConexao.getConexao();
		PreparedStatement stmt = null;

		int tentativas = 3;
		boolean logical = true;

		String createTable = "CREATE TABLE IF NOT EXISTS carro(" + "id INT AUTO_INCREMENT PRIMARY KEY ,"
				+ "ano INT NOT NULL," + "nome VARCHAR(50) NOT NULL," + "marca VARCHAR(30) NOT NULL,"
				+ "cor VARCHAR(10) NOT NULL," + "ipva FLOAT NOT NULL," + "valor FLOAT NOT NULL" + ")";

		try {
			stmt = connection.prepareStatement(createTable);
			stmt.execute(createTable);

			while (logical) {
				System.out.println("=============== Sistema de Locadora  ===============");
				System.out.println("");
				System.out.println("1 - Cadastrar Carro");
				System.out.println("2 - Consultar Todos os Carros");
				System.out.println("3 - Remover Carro");
				System.out.println("4 - Atualizar Carro");
				System.out.println("0 - Para Sair");

				Scanner input = new Scanner(System.in);
				System.out.println("Digite uma opção: ");
				int option = input.nextInt();
				
				
				
				if (option == 0) {
					System.out.println("Programa Encerrado!");
					break;
				}
				if (option == 1) {

					System.out.println("Digite o ANO do Carro : ");
					int ano = input.nextInt();
					input.nextLine();

					System.out.println("Digite o Nome do Carro : ");
					String nome = input.nextLine();

					System.out.println("Digite o nome da Marca do Carro : ");
					String marca = input.nextLine();

					System.out.println("Digite a cor do Carro : ");
					String cor = input.nextLine();

					System.out.println("Digite o valor do IPVA do Carro : ");
					float ipva = input.nextFloat();

					System.out.println("Digite o valor do Carro : ");
					float valor = input.nextFloat();

					String insert = "INSERT INTO carro(ano,nome,marca,cor,ipva,valor) VALUES (?,?,?,?,?,?);";

					stmt = connection.prepareStatement(insert);
					stmt.setInt(1, ano);
					stmt.setString(2, nome);
					stmt.setString(3, marca);
					stmt.setString(4, cor);
					stmt.setFloat(5, ipva);
					stmt.setFloat(6, valor);

					stmt.execute();
				}
				if (option == 2) {
					String selectAll = "SELECT * FROM carro;";

					PreparedStatement st = connection.prepareStatement(selectAll);

					ResultSet r = st.executeQuery();
					List<Carro> carros = new ArrayList<>();

					while (r.next()) {
						int id = r.getInt("id");
						int ano = r.getInt("ano");
						String nome = r.getString("nome");
						String marca = r.getString("marca");
						String cor = r.getString("cor");
						Double ivpa = r.getDouble("ipva");
						Double valor = r.getDouble("valor");

						carros.add(new Carro(id, ano, nome, marca, cor, ivpa, valor));
					}

					System.out.println("CARROS CADASTRADOS:");
					for (Carro c : carros) {
						System.out.println( + c.getId() + " | " + c.getAno() + "| " + c.getNome() + " | " + c.getMarca()
								+ " | " + c.getCor() + " | " + c.getIpva() + " | " + c.getValor());
						System.out.println("");
					}

				}
				if (option == 3) {

					System.out.println("Digite o codigo do Carro que deseja Remover: ");
					int codigoCarroRemocao = input.nextInt();
					
					String delete = "DELETE FROM carro WHERE id = ?; ";
					stmt = connection.prepareStatement(delete);
					stmt.setInt(1, codigoCarroRemocao);
					
					if(stmt.executeUpdate() > 0) {			
						System.out.println("Registro excluído com sucesso!");
					}else {				
						System.out.println("Registro não excluído(Não Existente no Banco de Dados!");
					}

					
				}
				if (option == 4) {					
					System.out.println("Digite o codigo do Carro que deseja Atualizar: ");
					int codigoUpdate = input.nextInt();

					String select = "SELECT id,ano,nome,marca,cor,ipva,valor FROM carro WHERE id = ?";
					stmt = connection.prepareStatement(select);
					stmt.setInt(1, codigoUpdate);
					ResultSet r = stmt.executeQuery();
					
					List<Carro> carros = new ArrayList<>();
					
					if(r.next()) {
						Carro c = new Carro(r.getInt(1),r.getInt(2),r.getString(3),
								r.getString(4),r.getString(5),r.getDouble(6),r.getDouble(7));
						
						
						System.out.println("ID: " + c.getId()+" | ANO: "+c.getAno()
						+" | NOME: "+c.getNome()+" | MARCA: "+c.getMarca()
						+" | COR: "+c.getCor()+" | IPVA: "+c.getIpva()+" | VALOR: "+c.getValor());
						System.out.println();
						
						System.out.println("Informe o novo ANO: ");
						int novoAno = input.nextInt();
						
						System.out.println("Informe o novo NOME: ");
						String novoNome = input.next();
						
						System.out.println("Informe a nova MARCA: ");
						String novaMarca = input.next();
						
						System.out.println("Informe a nova COR: ");
						String novaCor = input.next();
						
						System.out.println("Informe o novo valor do IPVA: ");
						Double novoIpva = input.nextDouble();
						
						System.out.println("Informe o novo valor do CARRO: ");
						Double novoValor = input.nextDouble();
						
						String sqlUpdate = "UPDATE carro SET ano = ?"
								+ ", nome = ? "
								+ ", marca = ? "
								+ ", cor = ? "
								+ ", ipva = ? "
								+ ", valor = ? "
								+ "WHERE id = ?";
						
						stmt.close();
						stmt = connection.prepareStatement(sqlUpdate);
						stmt.setInt(1, novoAno);
						stmt.setString(2,novoNome);
						stmt.setString(3, novaMarca);
						stmt.setString(4, novaCor);
						stmt.setDouble(5, novoIpva);
						stmt.setDouble(6, novoValor);
						stmt.setInt(7, codigoUpdate);
						
						stmt.execute();
						
						System.out.println("Carro alterado com sucesso! ");
					}
					
				}

				if (option < 0 || option > 4) {
					if (tentativas > 1) {
						System.out.println("Tente novamente");
						System.out.printf("Você possui apenas %d tentativas\n", tentativas - 1);
						tentativas -= 1;
						continue;
					} else if (tentativas == 1) {
						System.out.println("Programa encerrado!");
						break;
					}
				}

			}

			connection.close();

		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco de dados!");
			System.out.println("Tente novamente!");
		}
		
		catch (InputMismatchException e) {
			throw new ErroLetraException();
		}

	}

}
