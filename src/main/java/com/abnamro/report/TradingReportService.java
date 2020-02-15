package com.abnamro.report;

import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.stereotype.Service;

@Service
public class TradingReportService {

    public void getReport() {
        ReadOnlyKeyValueStore<String, Long> keyValueStore =
                streams.store("CountsKeyValueStore", QueryableStoreTypes.keyValueStore());

    }
}
