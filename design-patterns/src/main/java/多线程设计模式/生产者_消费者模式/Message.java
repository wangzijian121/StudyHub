package 多线程设计模式.生产者_消费者模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zijian Wang
 */
@Slf4j(topic = "c.Message")
@Data
@AllArgsConstructor
public class Message {
    private int id;
    private String value;

}

