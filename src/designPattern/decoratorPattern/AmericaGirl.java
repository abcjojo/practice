package designPattern.decoratorPattern;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:45
 **/
public class AmericaGirl extends Girl {
    @Override
    public String getDesc() {
        return "+America";
    }
}
