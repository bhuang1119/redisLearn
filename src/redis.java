import redis.clients.jedis.Jedis;

public class redis {
    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");
        System.out.println("服务正在运行："+jedis.ping());
    }
}
