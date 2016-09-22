package org.elasticsearch.metrics;

/**
 *
 */
public interface IndexNameProvider {

    String getIndexBase();

    String getIndexName(Long timestamp);

}
