package org.hospital.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hospital.pojo.Department;
import org.hospital.pojo.Doctor;
import org.hospital.pojo.DoctorWithDepart;
import org.hospital.pojo.Medicine;
import org.hospital.pojo.Patient;
import org.hospital.pojo.Pay;
import org.hospital.pojo.Treatment;
import org.hospital.pojo.User;

public interface HospitalMapper {
	
	public List<Patient> selectAllPatient();//查找所有病人√
	public int deletePatient(@Param("id") int id);//根据id删除病人*如果在treatment中含有这个病人，那就不能删除成功
	public int insertPatient(Patient patient);//插入病人√
	public int updatePatient(Patient patient);//修改病人信息√
	public Patient selectByID(@Param("id") int id);//根据id查找病人√
	public int selectExit(@Param("id") int id);//查找id，看这个id的病人是否存在1存在0为空√
	
	public int insertDoctor(Doctor doctor);//插入医生信息√
	public int selectDorExit(@Param("id") int id);//判断医生信息是否存在√
	public Doctor selectDorById(@Param("id") int id);//根据id查找医生**
	public List<Doctor> selectAllDoctor();//查找所有医生信息√
	public int updateDoctor(Doctor doctor);//修改医生信息√
	public int deleteDor(@Param("id") int id);//删除医生信息√
	
	public int selectDEExit(@Param("id") int id);//判断科室是否存在√
	public int addDepartment(Department department);//增加科室√
	public int updateDEPART(Department department);//修改科室信息√
	public List<Department> selectAllDer();//查找所有科室信息√
	public List<DoctorWithDepart> selectDeDor(@Param("id") int id);//根据科室ID查找该科的医生
	
	public int payExit(@Param("id") int id);//判断收费项目是否存在√
	public int addPay(Pay pay);//增加收费项目√
	public int deletePay(@Param("id") int id);//删除收费项目信息√
	public List<Pay> selectAllpay();//查找所有收费项目√
	public Pay selectPayById(@Param("id") int id);//根据Id查找收费项目信息√
	public int updatePay(Pay pay);//修改收费项目
	
	
	public List<Medicine> selectAllMe();//查找所有药品信息√
	public boolean updateMeNumber(Medicine medicine);//更改药品数量:销毁或存入√
	public Medicine selectMeById(@Param("id") int id);//根据id查找药品 √
	public int addMedicine(Medicine medicine);//增加药品
	
	public List<Treatment> selectTreatById(@Param("id") int id);//根据病号查找治疗收费以及病人信息√
	public List<Treatment> selectAllTreat();//查找全部的治疗收费以及病人信息√
	public boolean updateTreat(@Param("id") int id);//根据治疗id废除票据（收费信息）将effective改为0 √
	public List<Treatment> selectEmptyTreat();//查询所有废除的票据√
	public List<Treatment> selectTreatByTime(String createTime);//查询某天的票据信息
	
	
	public int isUserSet(@Param("userName") String userName);
	public int login(User user);
	public int regist(User user);
	
}
