package 多线程.java并发编程.java共享模型_无锁.ABA问题;

/**
 * 银行账户接口
 *
 * @author zijian Wang
 */
public interface Account {

    /**
     * 获取余额
     *
     * @return
     */
    int getBalance();

    /**
     * 取款
     *
     * @param amount 取款金额
     */
    void withdrawals(int amount);
}
