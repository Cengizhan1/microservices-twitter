package com.microservices.twitter.reactive.elastic.query.service.business;

import com.microservices.twitter.elastic.query.service.common.model.ElasticQueryServiceResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryService {

    Flux<ElasticQueryServiceResponseModel> getDocumentByText(String text);
}
