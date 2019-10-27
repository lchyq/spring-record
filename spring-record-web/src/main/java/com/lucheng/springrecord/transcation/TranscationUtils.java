package com.lucheng.springrecord.transcation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@ComponentScan
public class TranscationUtils {
    @Autowired
    private static PlatformTransactionManager platformTransactionManager;
    private static TransactionStatus transactionStatus = null;
    public static void start(){
        transactionStatus = platformTransactionManager.getTransaction(new DefaultTransactionDefinition());
        platformTransactionManager.commit(transactionStatus);
    }
}
