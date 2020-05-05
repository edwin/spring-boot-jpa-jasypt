package com.redhat.edw.service;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.hibernate5.encryptor.HibernatePBEEncryptorRegistry;
import org.jasypt.iv.RandomIvGenerator;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *     com.redhat.edw.service.EncryptionConfig
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Mei 2020 12:05
 */
@Configuration
public class EncryptionConfig {

    public EncryptionConfig() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setPoolSize(4);
        encryptor.setPassword("MY-PASSPASSPASS123");
        encryptor.setAlgorithm("PBEWithMD5AndTripleDES");
        encryptor.setIvGenerator(new RandomIvGenerator());
        encryptor.setKeyObtentionIterations(1500);

        HibernatePBEEncryptorRegistry registry = HibernatePBEEncryptorRegistry.getInstance();
        registry.registerPBEStringEncryptor("myStringEncryptor", encryptor);
    }
}
