package com.microservices.twitter.analytics.service.business;

import com.microservices.twitter.analytics.service.model.AnalyticsResponseModel;

import java.util.Optional;

public interface AnalyticsService {

    Optional<AnalyticsResponseModel> getWordAnalytics(String word);
}

