import org.apache.ibatis.session.SqlSession;
import util.SqlSessionUtils;

import java.util.List;

/**
 * Created by wujiaqin on 2019/2/17.
 */
public class SqlTest {

    private static final String NAMESPACE = "dao.TestMapper.";

    public static void main(String[] args) {

        SqlSession session = SqlSessionUtils.openSession();

        final List<Object> users = session.selectList(NAMESPACE + "selectAll");
        System.out.println(users);

    }


}
