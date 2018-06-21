package br.com.cutrale.FirstProjectWithSpringBoot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.cutrale.FirstProjectWithSpringBoot.model.ObjFramework;

@Repository
public class ObjFrameworkRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ObjFramework> findAll() {

		List<ObjFramework> listObjFramework = jdbcTemplate.query("SELECT obj_nome, versao FROM obj_framework",
				(rs, rowNum) -> new ObjFramework(rs.getString("obj_nome"), rs.getInt("versao")));

		return listObjFramework;

	}

}
