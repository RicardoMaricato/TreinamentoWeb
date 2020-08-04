package br.com.rd.rdevs.moduloweb.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.rdevs.moduloweb.dao.ModuloDAO;
import br.com.rd.rdevs.moduloweb.dao.MysqlConnectionDAO;
import br.com.rd.rdevs.moduloweb.model.Modulo;

@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public ModulosTreinamentoServlet() {
    	System.out.println("Iniciando a nosssa servlet...");
    }
	
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
//		Exercício 04    	
//    	List<Modulo> listaModulo = new ArrayList();    	
//    	ModuloDAO moduloDAO = new ModuloDAO();
//		listaModulo = moduloDAO.consultarModulos();
//		
//		req.setAttribute("modulos", listaModulo);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("/consulta-modulos.jsp");
//		rd.forward(req, resp);
    	
    	MysqlConnectionDAO conexaoMysql = new MysqlConnectionDAO();		
		
    	
    	List<Modulo> listaModulo = new ArrayList();
    	
		try {
			ModuloDAO moduloDAO = new ModuloDAO();
			listaModulo = moduloDAO.consultarModulos();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.setAttribute("modulos", listaModulo);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consulta-modulos.jsp");
		rd.forward(req, resp);
	}

}
