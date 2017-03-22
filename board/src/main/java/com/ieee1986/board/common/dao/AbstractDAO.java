package com.ieee1986.board.common.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDAO {
	protected Log log = LogFactory.getLog(AbstractDAO.class);

	@Autowired
	private SqlSessionTemplate sqlSession;

	protected void printQuery(String queryId) {
		if (log.isDebugEnabled()) {
			log.debug(" \t QueryId \t : " + queryId);
		}
	}

	public Object insert(String queryId, Object params) {
		printQuery(queryId);
		return sqlSession.insert(queryId, params);
	}

	public Object update(String queryId, Object params) {
		printQuery(queryId);
		return sqlSession.update(queryId, params);
	}

	public Object selectOne(String queryId) {
		printQuery(queryId);
		return sqlSession.selectOne(queryId);
	}

	public Object selectOne(String queryId, Object params) {
		printQuery(queryId);
		return sqlSession.selectOne(queryId, params);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId) {
		printQuery(queryId);
		return sqlSession.selectList(queryId);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params) {
		printQuery(queryId);
		return sqlSession.selectList(queryId, params);
	}

}
