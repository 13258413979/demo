package demo.pattren.factory.abstracts;

import demo.pattren.factory.Sender;
import demo.pattren.factory.WeChatSender;

/**
 * WeChat产品创建工厂
 */
public class WeChatFactory extends AbstractFactory{
    @Override
    public Sender getSender() {
        return new WeChatSender();
    }
}
