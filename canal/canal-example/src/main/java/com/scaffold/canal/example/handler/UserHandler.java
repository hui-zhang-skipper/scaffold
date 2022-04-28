package com.scaffold.canal.example.handler;


import com.scaffold.canal.annotation.CanalTable;
import com.scaffold.canal.example.model.User;
import com.scaffold.canal.handler.EntryHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@CanalTable(value = "t_user")
public class UserHandler implements EntryHandler<User> {


    private Logger logger = LoggerFactory.getLogger(UserHandler.class);


    @Override
    public void insert(User user) {
        logger.info("insert message  {}", user);
    }

    @Override
    public void update(User before, User after) {
        logger.info("update before {} ", before);
        logger.info("update after {}", after);
    }

    @Override
    public void delete(User user) {
        logger.info("delete  {}", user);
    }
}
