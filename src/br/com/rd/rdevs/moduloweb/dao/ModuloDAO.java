package br.com.rd.rdevs.moduloweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.rd.rdevs.moduloweb.model.Modulo;

public class ModuloDAO {		
	
	private static final Modulo New = null;
	private String SQL_LISTAR = "select ds_nome, ds_instrutor_titular, ds_instrutor_auxiliar, dt_inicio from tb_modulo";


	public ModuloDAO() {
		super();
	}
	
//	Exercício 04
//	public List<Modulo> consultarModulos() throws ParseException {
//		
//		List<Modulo> listarModulo = new ArrayList();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
// 		Date date;
//	
//		Modulo modulo1 = new Modulo();
//		modulo1.setDsNome("NIVELAMENTO");
//		modulo1.setDsInstrutorTitular("Ivo");
//		modulo1.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-20");
//		modulo1.setDtInicio(date);
//		
//		Modulo modulo2 = new Modulo();
//		modulo2.setDsNome("HTML/CSS");
//		modulo2.setDsInstrutorTitular("Jonas");
//		modulo2.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-20");
//		modulo2.setDtInicio(date);
//		
//		Modulo modulo3 = new Modulo();
//		modulo3.setDsNome("JAVASCRIPT");
//		modulo3.setDsInstrutorTitular("Jonas");
//		modulo3.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-20");
//		modulo3.setDtInicio(date);
//		
//		Modulo modulo4 = new Modulo();
//		modulo4.setDsNome("POO");
//		modulo4.setDsInstrutorTitular("Ivo");
//		modulo4.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-20");
//		modulo4.setDtInicio(date);
//		
//		Modulo modulo5 = new Modulo();
//		modulo5.setDsNome("Java");
//		modulo5.setDsInstrutorTitular("Leonardo");
//		modulo5.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-06-20");
//		modulo5.setDtInicio(date);
//		
//		Modulo modulo6 = new Modulo();
//		modulo6.setDsNome("BD");
//		modulo6.setDsInstrutorTitular("Leonardo");
//		modulo6.setDsInstrutorAuxiliar("Fábio");
//		date = dateFormat.parse("2020-06-20");
//		modulo6.setDtInicio(date);
//		
//		Modulo modulo7 = new Modulo();
//		modulo7.setDsNome("Aplicações Web");
//		modulo7.setDsInstrutorTitular("Fábio");
//		modulo7.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-06-20");
//		modulo7.setDtInicio(date);
//		
//		Modulo modulo8 = new Modulo();
//		modulo8.setDsNome("Spring Boot");
//		modulo8.setDsInstrutorTitular("Fábio");
//		modulo8.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-06-20");
//		modulo8.setDtInicio(date);
//		
//		Modulo modulo9 = new Modulo();
//		modulo9.setDsNome("Angular");
//		modulo9.setDsInstrutorTitular("Jonas");
//		modulo9.setDsInstrutorAuxiliar("Fábio");
//		date = dateFormat.parse("2020-06-20");
//		modulo9.setDtInicio(date);
//		
//		listarModulo.add(modulo1);
//		listarModulo.add(modulo2);
//		listarModulo.add(modulo3);
//		listarModulo.add(modulo4);
//		listarModulo.add(modulo5);
//		listarModulo.add(modulo6);
//		listarModulo.add(modulo7);
//		listarModulo.add(modulo8);
//		listarModulo.add(modulo9);
//		
//		return listarModulo;
//	}

	public List<Modulo> consultarModulos() {
		
		List<Modulo> listarModulo = new ArrayList();
		
		try (Connection conn = MysqlConnectionDAO.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(SQL_LISTAR);) {

			while (rs.next()) {
				Modulo modulo = new Modulo();
				modulo.setDsNome(rs.getString("ds_nome"));
				modulo.setDsInstrutorTitular(rs.getString("ds_instrutor_titular"));
				modulo.setDsInstrutorAuxiliar(rs.getString("ds_instrutor_auxiliar"));
				modulo.setDtInicio(rs.getDate("dt_inicio"));

				listarModulo.add(modulo);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listarModulo;
	}
}
