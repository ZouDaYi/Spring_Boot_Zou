package com.zou.bean.mogo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface MogoRepository extends MongoRepository<MongoDB, Long> {

    MongoDB findByUsername(String username);
}
