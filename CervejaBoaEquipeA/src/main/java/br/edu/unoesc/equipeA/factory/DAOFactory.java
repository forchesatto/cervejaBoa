package br.edu.unoesc.equipeA.factory;

import br.edu.unoesc.equipeA.conexao.ConexaoMysqlProducao;
import br.edu.unoesc.equipeA.dao.CopoDAO;
import br.edu.unoesc.equipeA.dao.CopoJDBC;

public class DAOFactory {

	private static DAOFactory factory;

	/**
	 * Pega a fabrica de DAO, instância única para todo mundo. Padrão
	 * Singleton simples.
	 * 
	 * @return
	 */
	public static DAOFactory get() {
		if (factory == null) {
			factory = new DAOFactory();
		}
		return factory;
	}

	public CopoDAO copoDAO() {
		return new CopoJDBC(new ConexaoMysqlProducao());
	}
}
