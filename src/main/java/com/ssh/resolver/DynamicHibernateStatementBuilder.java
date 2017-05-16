package com.ssh.resolver;

import java.io.IOException;
import java.util.Map;

/**
 * 动态sql/hql语句组装器
 * 
 * @author WangXuzheng
 * 
 */
public interface DynamicHibernateStatementBuilder {
    /**
     * hql语句map
     * 
     * @return
     */
    public Map<String, String> getNamedHQLQueries();

    /**
     * sql语句map
     * 
     * @return
     */
    public Map<String, String> getNamedSQLQueries();

    public String getHQLScript(String scriptId);

    public String getSQLScript(String scriptId);

    /**
     * 初始化
     * 
     * @throws IOException
     */
    public void init() throws IOException;
}