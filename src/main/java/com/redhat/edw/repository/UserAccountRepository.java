package com.redhat.edw.repository;

import com.redhat.edw.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     com.redhat.edw.repository.UserAccountRepository
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Mei 2020 12:14
 */
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
}
