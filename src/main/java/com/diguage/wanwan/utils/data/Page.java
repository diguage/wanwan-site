package com.diguage.wanwan.utils.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 分页对象--拷贝自SpringData模块。
 * <p/>
 * Coder：D瓜哥，http://www.diguage.com/
 * <p/>
 * Date: 2014-08-21 16:19
 */
public class Page<T extends Object> implements Serializable, Iterable<T> {

    private static final long serialVersionUID = 543243589245258729L;


    private final List<T> content = new ArrayList<T>();
    private final PageRequest pageRequest;
    private final long total;

    /**
     * Constructor of {@code PageImpl}.
     *
     * @param content     the content of this page, must not be {@literal null}.
     * @param pageRequest the paging information, can be {@literal null}.
     * @param total       the total amount of items available
     */
    public Page(List<T> content, PageRequest pageRequest, long total) {

        if (null == content) {
            throw new IllegalArgumentException("Content must not be null!");
        }

        this.content.addAll(content);
        this.total = total;
        this.pageRequest = pageRequest;
    }

    /**
     * Creates a new {@link Page} with the given content. This will result in the created {@link Page} being identical
     * to the entire {@link java.util.List}.
     *
     * @param content must not be {@literal null}.
     */
    public Page(List<T> content) {
        this(content, null, null == content ? 0 : content.size());
    }

    public int getNumber() {
        return pageRequest == null ? 0 : pageRequest.getPageNumber();
    }

    public int getSize() {
        return pageRequest == null ? 0 : pageRequest.getPageSize();
    }

    public int getTotalPages() {
        return getSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) getSize());
    }

    public int getNumberOfElements() {
        return content.size();
    }

    public long getTotalElements() {
        return total;
    }

    public boolean hasPreviousPage() {
        return getNumber() > 0;
    }

    public boolean isFirstPage() {
        return !hasPreviousPage();
    }

    public boolean hasNextPage() {
        return getNumber() + 1 < getTotalPages();
    }

    public boolean isLastPage() {
        return !hasNextPage();
    }

    public PageRequest nextPageRequest() {
        return hasNextPage() ? pageRequest.next() : null;
    }

    public PageRequest previousPageRequest() {

        if (hasPreviousPage()) {
            return pageRequest.previousOrFirst();
        }

        return null;
    }

    public Iterator<T> iterator() {
        return content.iterator();
    }

    public List<T> getContent() {
        return Collections.unmodifiableList(content);
    }

    public boolean hasContent() {
        return !content.isEmpty();
    }

    public Sort getSort() {
        return pageRequest == null ? null : pageRequest.getSort();
    }

    @Override
    public String toString() {

        String contentType = "UNKNOWN";

        if (content.size() > 0) {
            contentType = content.get(0).getClass().getName();
        }

        return String.format("Page %s of %d containing %s instances", getNumber(), getTotalPages(), contentType);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Page<?>)) {
            return false;
        }

        Page<?> that = (Page<?>) obj;

        boolean totalEqual = this.total == that.total;
        boolean contentEqual = this.content.equals(that.content);
        boolean PageRequestEqual = this.pageRequest == null ? that.pageRequest == null : this.pageRequest.equals(that.pageRequest);

        return totalEqual && contentEqual && PageRequestEqual;
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + (int) (total ^ total >>> 32);
        result = 31 * result + (pageRequest == null ? 0 : pageRequest.hashCode());
        result = 31 * result + content.hashCode();

        return result;
    }
}
