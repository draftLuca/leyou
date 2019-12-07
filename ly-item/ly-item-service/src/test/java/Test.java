import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.junit.runner.RunWith;

public class Test {

    @org.junit.Test
    public void  test1(){
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

        // 连接到数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");
        System.out.println("Connect to database successfully");
    }
}
