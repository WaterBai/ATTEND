package com.ssh.model;

import java.util.List;

/**
 * 分页封装类 用于做分页查询的基础类，封装了一些分页的相关属性
 * 
 * @author 闫洲
 * @version v1.0
 * @param <T>
 */
public class PageBean<T> {

    // 当前页
    private int currentPage;

    // 每页个个数
    private int pageSize;

    // 总条数
    private int totalCount;

    // 总页数
    private int pageCount;

    // 记录
    private List<T> results;

    public PageBean() {
        super();
    }

    public PageBean(int currentPage, int pageSize, int totalCount,
            List<T> results) {
        super();
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.pageCount = totalCount / pageSize + 1;
        this.results = results;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize <= 0 ? 10 : pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "PageResults [currentPage=" + currentPage + ", pageSize="
                + pageSize + ", totalCount=" + totalCount + ", pageCount="
                + pageCount + ", results=" + results + "]";
    }
}