package cn.itsource.aigou.controller;


import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    // restful:地址尽量不用动词:  获取一个员工: localhost:8001/employee/getById?id
    // @RequestBody 把请求的body中的数据,springmvc的原理封装进去
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
<<<<<<< HEAD
		System.out.println("111111d1111");
=======
        System.out.println("dddddd22221111ddd");
>>>>>>> b6466f79d0e6777e1fc48e2c72591dd8737b4489
        //本来应该获取到用户信息,去和数据库对比:我这里只是模拟:
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }

    }


}
