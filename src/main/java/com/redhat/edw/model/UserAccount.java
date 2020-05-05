package com.redhat.edw.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <pre>
 *     com.redhat.edw.model.UserAccount
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Mei 2020 11:54
 */
@Entity
@Table(name = "t_user_account")
public class UserAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Type(type="encryptedString")
    @Column(name = "account_no", length = 300)
    private String accountNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
