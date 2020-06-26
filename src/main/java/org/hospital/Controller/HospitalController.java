package org.hospital.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hospital.Service.HospitalService;
import org.hospital.Utils.Message;
import org.hospital.pojo.Department;
import org.hospital.pojo.Doctor;
import org.hospital.pojo.DoctorWithDepart;
import org.hospital.pojo.Medicine;
import org.hospital.pojo.Patient;
import org.hospital.pojo.Pay;
import org.hospital.pojo.Treatment;
import org.hospital.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/hos")
public class HospitalController {
	
	@Autowired
	HospitalService hosService;
	
	@RequestMapping(value="selectAllPatient",method= {RequestMethod.GET})
	@ResponseBody
	public Message selectAllPatient() {//查找全部病人
		Message message=new Message();
		List<Patient> result=hosService.selectAllPatient();
		message.setData(result);
		return message;
	}
	
	
	@RequestMapping(value="selectById",method= {RequestMethod.GET})
	@ResponseBody
	public Message selectById(int id) {//根据ID查找病人
		Message message=new Message();
		Patient patient=hosService.selectByID(id);
		message.setData(patient);
		return message;
		
	}
	
	@RequestMapping(value="insertPatient",method= {RequestMethod.GET})
	@ResponseBody
	public Message insertPatient(Patient patient) {
		Message message=new Message();
		boolean result=hosService.insertPatient(patient);
		if(result==true) {
			message.setMsg("添加成功");
		}else {
			message.setMsg("添加失败");
		}
		return message;
	}
	

	@RequestMapping(value="deletePatient",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message deletePatient(int id) {//根据id删除病人
		Message message=new Message();
		boolean flag=hosService.deletePatient(id);
		if(flag==true) {
			message.setMsg("删除成功");
		}else {
			message.setMsg("删除失败");
		}
		return message;
	}
	
	@RequestMapping(value="updatePatient",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message updatePatient(Patient patient){//更新病人信息
		Message message=new Message();
		boolean flag =hosService.updatePatient(patient);
		if(flag==true) {
			message.setMsg("更新成功");
		}else {
			message.setMsg("更新失败");
		}
		return message;
	}
	
	//医生
	@ResponseBody
	@RequestMapping(value= "insertDoctor",method= {RequestMethod.GET})//post
	public Message insertDoctor(Doctor doctor) {
		Message message=new Message();
		boolean doctor1 = hosService.insertDoctor(doctor);
		if(doctor1==true) {
			message.setMsg("添加成功");
		}else {
			message.setMsg("添加失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectDorById",method= {RequestMethod.GET})
	public Message selectDorById(int id) {
		Message message=new Message();
		Doctor doctor=hosService.selectDorById(id);
		message.setData(doctor);
		return message;
	}
	@RequestMapping(value="deleteDor",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message deleteDor(int id) {//根据id删除病人
		Message message=new Message();
		boolean flag=hosService.deleteDor(id);
		if(flag==true) {
			message.setMsg("删除成功");
		}else {
			message.setMsg("删除失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectAllDoctor",method= {RequestMethod.POST})
	public Message selectAllDoctor() {
		Message message=new Message();
		List<Doctor> doctor=hosService.selectAllDoctor();
		message.setData(doctor);
		return message;
	}
	
	@RequestMapping(value="updateDoctor",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message updateDoctor(Doctor doctor){//更新病人信息
		Message message=new Message();
		boolean flag =hosService.updateDoctor(doctor);
		if(flag==true) {
			message.setMsg("更新失败");
		}else {
			message.setMsg("更新成功");
		}
		return message;
	}
	
	//科室信息
	@ResponseBody
	@RequestMapping(value= "addDepartment",method= {RequestMethod.GET})//post
	public Message addDepartment(Department department) {
		Message message=new Message();
		boolean doctor1 = hosService.addDepartment(department);
		if(doctor1==true) {
			message.setMsg("添加成功");
		}else {
			message.setMsg("添加失败");
		}
		return message;
	}
	
	@RequestMapping(value="updateDEPART",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message updateDEPART(Department department){//更新病人信息
		Message message=new Message();
		boolean flag =hosService.updateDEPART(department);
		if(flag==true) {
			message.setMsg("更新成功");
		}else {
			message.setMsg("更新失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectAllDer",method= {RequestMethod.GET})
	public Message selectAllDer() {
		Message message=new Message();
		List<Department> doctor=hosService.selectAllDer();
		message.setData(doctor);
		return message;
	}
	
	//收费项目
	@ResponseBody
	@RequestMapping(value= "addPay",method= {RequestMethod.GET})//post
	public Message addPay(Pay pay) {
		Message message=new Message();
		boolean p = hosService.addPay(pay);
		if(p==true) {
			message.setMsg("添加成功");
		}else {
			message.setMsg("添加失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "deletePay",method= {RequestMethod.GET})//post
	public Message deletePay(int id) {
		Message message=new Message();
        boolean flag=hosService.deletePay(id);
        if(flag==true) {
			message.setMsg("删除成功");
		}else {
			message.setMsg("删除失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectAllpay",method= {RequestMethod.GET})
	public Message selectAllpay() {
		Message message=new Message();
		List<Pay> result=hosService.selectAllpay();
		message.setData(result);
		return message;
	}
	
	@RequestMapping(value="updatePay",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message updatePay(Pay pay){//更新病人信息
		Message message=new Message();
		boolean flag =hosService.updatePay(pay);
		if(flag==true) {
			message.setMsg("更新成功");
		}else {
			message.setMsg("更新失败");
		}
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectPayById",method= {RequestMethod.GET})
	public Message selectPayById(int id) {
		Message message=new Message();
		Pay result=hosService.selectPayById(id);
		message.setData(result);
		return message;
	}
	
	//药品
	@ResponseBody
	@RequestMapping(value= "selectAllMe",method= {RequestMethod.GET})
	public Message selectAllMe() {
		Message message=new Message();
		List<Medicine> result=hosService.selectAllMe();
		message.setData(result);
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectMeById",method= {RequestMethod.GET})
	public Message selectMeById(int id) {
		Message message=new Message();
		Medicine result=hosService.selectMeById(id);
		message.setData(result);
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "addMedicine",method= {RequestMethod.GET})//post
	public Message addMedicine(Medicine medicine) {
		Message message=new Message();
		boolean p = hosService.addMedicine(medicine);
		if(p==true) {
			message.setMsg("添加成功");
		}else {
			message.setMsg("添加失败");
		}
		return message;
	}
	
	@RequestMapping(value="updateMeNumber",method= {RequestMethod.GET})//post
	@ResponseBody
	public Message updateMeNumber(Medicine medicine){//更新药物信息
		Message message=new Message();
		boolean flag =hosService.updateMeNumber(medicine);
		if(flag==true) {
			message.setMsg("药品数量更新成功");
		}else {
			message.setMsg("药品数量更新失败");
		}
		return message;
	}
	
	//某个病人的所有治疗信息的单据
	@ResponseBody
	@RequestMapping(value= "selectTreatById",method= {RequestMethod.GET})
	public Message selectTreatById(int id) {
		Message message=new Message();
		List<Treatment> result=hosService.selectTreatById(id);
		int money = 0;
		for(int i=0;i<result.size();i++) {
			Treatment obj=(Treatment)result.get(i);
			money+=obj.getMoney();
		}
		message.setMsg("您应缴纳金额");
		message.setStatus(money);
		message.setData(result);
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectAllTreat",method= {RequestMethod.GET})
	public Message selectAllTreat() {
		Message message=new Message();
		List<Treatment> result=hosService.selectAllTreat();
		message.setData(result);
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "selectEmptyTreat",method= {RequestMethod.GET})
	public Message selectEmptyTreat() {
		Message message=new Message();
		List<Treatment> result=hosService.selectEmptyTreat();
		message.setData(result);
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value= "updateTreat",method= {RequestMethod.GET})//post
	public Message updateTreat(int id) {
		Message message=new Message();
		boolean flag =hosService.updateTreat(id);
		if(flag==true) {
			message.setMsg("废除成功");
		}else {
			message.setMsg("废除失败");
		}
		return message;
	}
	
	@RequestMapping(value="selectDeDor",method= {RequestMethod.GET})
	@ResponseBody
	public Message selectDeDor(int id) {//查找全部病人
		Message message=new Message();
		List<DoctorWithDepart> result=hosService.selectDeDor(id);
		message.setData(result);
		return message;
	}
	
	@RequestMapping(value="selectTreatByTime",method= {RequestMethod.GET})
	@ResponseBody
	public Message selectTreatByTime(String createTime) {//查找全部病人
		Message message=new Message();
		List<Treatment> result=hosService.selectTreatByTime(createTime);
		message.setData(result);
		return message;
	}
	
	@RequestMapping(value="login",method= {RequestMethod.POST})
	@ResponseBody
	public Message login(String userName,String passWord) {
		Message message=new Message();
	    int no=hosService.login(user);
        if(no>0) {
        	message.setMsg("登录成功");
        	return "index";
        }else {
        	message.setMsg("登录失败");
        	return login;
        }
	    return message;
	}	    
	 @RequestMapping("login")
		public String  login(@RequestParam("username") String username,
				@RequestParam("password") String password,Model model){
			User user = new User();
			user.setName(username);
			user.setPwd(password);
			if(userService.logincheck(user) != null){
				model.addAttribute("username",username);
				return "index";
			}
		    else{
		    	model.addAttribute("error","账号或密码错误");
		    	return "login";
		    }
	
	
	
	@RequestMapping(value="regist",method= {RequestMethod.POST})
	@ResponseBody
	public Message regist(User user) {//根据ID查找病人
		Message message=new Message();
		boolean flag=hosService.regist(user);
		if(flag==true) {
			message.setMsg("注册成功");
		}else {
			message.setMsg("注册失败");
		}
		return message;
		
	}
	
}
