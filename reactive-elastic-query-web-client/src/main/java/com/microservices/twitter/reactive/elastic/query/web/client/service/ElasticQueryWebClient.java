package com.microservices.twitter.reactive.elastic.query.web.client.service;

import com.microservices.twitter.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;
import com.microservices.twitter.elastic.query.web.client.common.model.ElasticQueryWebClientResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryWebClient {

    Flux<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel request);
}
