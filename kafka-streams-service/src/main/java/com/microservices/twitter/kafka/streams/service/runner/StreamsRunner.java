package com.microservices.twitter.kafka.streams.service.runner;

public interface StreamsRunner<K, V> {
    void start();
    default V getValueByKey(K key) {
        return null;
    }
}
