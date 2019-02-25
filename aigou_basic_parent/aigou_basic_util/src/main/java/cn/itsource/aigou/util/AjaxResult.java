package cn.itsource.aigou.util;

public class AjaxResult {

    private boolean success=true;//操作是否成功

    private String msg="操作成功";//返回文本字符串的信息

    private Object object;//返回的一个object对象

    /**
     * 提供一个获取对象实例的方法
     * @return
     */
    public  static  AjaxResult me(){
        return new AjaxResult();
    }

   /* *
     * 成功的构造函数
    public AjaxResult() {
    }

     * 失败的构造函数
     * @param msg
    public AjaxResult( String msg) {
        this.success = false;
        this.msg = msg;
    }*/

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return  this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
