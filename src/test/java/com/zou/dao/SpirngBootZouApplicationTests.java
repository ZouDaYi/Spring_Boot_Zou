package com.zou.dao;

import com.zou.async.Task;
import com.zou.bean.p.PUser;
import com.zou.bean.p.PUserRepository;
import com.zou.bean.s.Message;
import com.zou.bean.s.MessageRepository;
import com.zou.mail.Mail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpirngBootZouApplicationTests {
//
//    @Autowired
//    private CacheManager cacheManager;

    //测试多数据源
//    @Autowired
//    private PUserRepository puserRepository;
//    @Autowired
//    private MessageRepository messageRepository;
//
//    @Test
//    public void testManyData() throws Exception {
//        puserRepository.save(new PUser("aaa", 10));
//        puserRepository.save(new PUser("bbb", 20));
//        puserRepository.save(new PUser("ccc", 30));
//        puserRepository.save(new PUser("ddd", 40));
//        puserRepository.save(new PUser("eee", 50));
//        Assert.assertEquals(5, puserRepository.findAll().size());
//        messageRepository.save(new Message("o1", "aaaaaaaaaa"));
//        messageRepository.save(new Message("o2", "bbbbbbbbbb"));
//        messageRepository.save(new Message("o3", "cccccccccc"));
//        Assert.assertEquals(3, messageRepository.findAll().size());
//    }
    //测试多数据源

    @Autowired
    private JavaMailSender mailSender;
    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1039442726@qq.com");
        message.setTo("2850208202@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }


    //测试数据库连接和CRUD
//    @Autowired
//    UserRepository userRepository;
//    @Test//事务名  隔离级别  传播行为
//    @Transactional(value="One",isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
//    public void test() throws Exception {
//        //创建10条记录
//        userRepository.save(new User("111", 10));
//        userRepository.save(new User("222", 20));
//        userRepository.save(new User("333", 30));
//        userRepository.save(new User("444", 40));
//        userRepository.save(new User("555", 50));
//        userRepository.save(new User("666", 60));
//        userRepository.save(new User("777", 70));
//        userRepository.save(new User("888", 80));
//        userRepository.save(new User("999", 90));
//        userRepository.save(new User("000", 100));
//        //测试findAll, 查询所有记录
//        Assert.assertEquals(10, userRepository.findAll().size());
//        Assert.assertEquals(60, userRepository.findByName("666").getAge().longValue());
//        Assert.assertEquals(60, userRepository.findUser("555").getAge().longValue());
//        Assert.assertEquals("FFF", userRepository.findByNameAndAge("666", 60).getName());
//        userRepository.delete(userRepository.findByName("1111"));
//        Assert.assertEquals(9, userRepository.findAll().size());
//    }
    //测试数据库连接和CRUD


    //测试缓存
//    @Test
//    public void testCache() throws Exception {
//        User u1 = userRepository.findUser("BBB");
//        System.out.println("第一次查询：" + u1.getAge());
//        User u2 = userRepository.findUser("BBB");
//        System.out.println("第二次查询：" + u2.getAge());
//    }
    //测试缓存


    //测试MongoDB
//    @Autowired
//    private MogoRepository mogoRepository;
//
//    @Before
//    public void setUp() {
//        mogoRepository.deleteAll();
//    }
//
//    @Test
//    public void testMogo() throws Exception {
//        // 创建三个User，并验证User总数
//        mogoRepository.save(new MongoDB(1L, "didi", 30));
//        mogoRepository.save(new MongoDB(2L, "mama", 40));
//        mogoRepository.save(new MongoDB(3L, "kaka", 50));
////        Assert.assertEquals(3, mogoRepository.findAll().size());
//        // 删除一个User，再验证User总数
//        MongoDB mongoDB = mogoRepository.findOne(1L);
//        mogoRepository.delete(mongoDB);
//        Assert.assertEquals(2, mogoRepository.findAll().size());
//        // 删除一个User，再验证User总数
//        mongoDB = mogoRepository.findByUsername("mama");
//        mogoRepository.delete(mongoDB);
//        Assert.assertEquals(1, mogoRepository.findAll().size());
//    }
//测试MongoDB


    //测试MyBatis
//    @Autowired
//    private UserMapper userMapper;
//    @Test
//    @Rollback
//    public void findByName() throws Exception {
//        userMapper.insert("zdy", 20);
//        MyBatisUser myBatisUser = userMapper.findByName("zdy");
//        Assert.assertEquals(20, myBatisUser.getAge().intValue());
//    }
    //测试MyBatis


    //测试异步调用

//    @Autowired
//    private Task task;
//    @Test
//    public void testTask() throws Exception {
//        long start = System.currentTimeMillis();
//        Future<String> task1 = task.doTaskOne();
//        Future<String> task2 = task.doTaskTwo();
//        Future<String> task3 = task.doTaskThree();
//        while(true) {
//            if(task1.isDone() && task2.isDone() && task3.isDone()) {
//                // 三个任务都调用完成，退出循环等待
//                break;
//            }
//            Thread.sleep(1000);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
//    }
    //测试异步调用


//@Autowired
//private StringRedisTemplate stringRedisTemplate;
//    @Test
//    public void test() throws Exception {
//        // 保存字符串
//        stringRedisTemplate.getClass();
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
//    }

}
