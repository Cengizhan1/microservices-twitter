package com.microservices.twitter.elastic.index.client.service;

import com.microservices.twitter.elastic.model.index.IndexModel;

import java.util.List;

public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
