package com.qmul.messaging.app.repository;

import com.qmul.messaging.app.model.GlobalMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalMessageRepository extends MongoRepository<GlobalMessage, String> {
}
