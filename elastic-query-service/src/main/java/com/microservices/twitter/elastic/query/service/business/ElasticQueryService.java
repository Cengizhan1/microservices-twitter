package com.microservices.twitter.elastic.query.service.business;

import com.microservices.twitter.elastic.query.service.common.model.ElasticQueryServiceResponseModel;
import com.microservices.twitter.elastic.query.service.model.ElasticQueryServiceAnalyticsResponseModel;

import java.util.List;

public interface ElasticQueryService {

    ElasticQueryServiceResponseModel getDocumentById(String id);

    ElasticQueryServiceAnalyticsResponseModel getDocumentByText(String text, String accessToken);

    List<ElasticQueryServiceResponseModel> getAllDocuments();
}
