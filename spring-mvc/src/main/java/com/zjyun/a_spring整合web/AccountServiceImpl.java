package com.zjyun.a_spring整合web;

import com.zjyun.a_spring整合web.mapper.AccountDao;
import com.zjyun.a_spring整合web.model.Account;
import net.jcip.annotations.NotThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/6/18
 */
@Service
@NotThreadSafe
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        Assert.notNull(accountDao,"为空！");
        this.accountDao = accountDao;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void transfer(Account sender, Account recipient, long amount) {
        sender.setBalance(sender.getBalance() - amount);
        accountDao.updateAccount(sender);
        System.out.println(sender.getName() + "扣款成功！");
        //int i = 0 / 0;
        recipient.setBalance(recipient.getBalance() + amount);
        accountDao.updateAccount(recipient);
        System.out.println(recipient.getName() + "收款成功！");
    }

    @Override
    public Account getAccount(int id) {
        return accountDao.getAccountById(id);
    }
}
