package com.zou.dao;

import com.zou.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpirngBootZouApplicationTests {

//    @Autowired
//    private CacheManager cacheManager;

//    //测试多数据源
//    @Autowired
//    private PUserRepository puserRepository;
//    @Autowired
//    private MessageRepository messageRepository;

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





    //测试数据库连接和CRUD
//    @Autowired
//    UserRepository userRepository;
//    @Test//事务名  隔离级别  传播行为
//    @Transactional(value="One",isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
//    public void test() throws Exception {
//        //创建10条记录
//        userRepository.save(new User("AAA", 10));
//        userRepository.save(new User("BBB", 20));
//        userRepository.save(new User("CCC", 30));
//        userRepository.save(new User("DDD", 40));
//        userRepository.save(new User("EEE", 50));
//        userRepository.save(new User("FFF", 60));
//        userRepository.save(new User("GGG", 70));
//        userRepository.save(new User("HHH", 80));
//        userRepository.save(new User("III", 90));
//        userRepository.save(new User("JJJ", 100));
//        //测试findAll, 查询所有记录
//        Assert.assertEquals(10, userRepository.findAll().size());
//        // 测试findByName, 查询姓名为FFF的User
//        Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
//        // 测试findUser, 查询姓名为FFF的User
//        Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());
//        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//        Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
//        // 测试删除姓名为AAA的User
//        userRepository.delete(userRepository.findByName("AAA"));
//        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
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

    @Autowired
    private Task task;
    @Test
    public void testTask() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
    //测试异步调用
}
