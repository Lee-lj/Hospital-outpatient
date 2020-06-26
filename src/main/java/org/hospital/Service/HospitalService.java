package org.hospital.Service;

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

public interface HospitalService {

	//病人信息
	public boolean insertPatient(Patient patient);
	public boolean updatePatient(Patient patient);
	public boolean deletePatient(int id);
	public List<Patient> selectAllPatient();
	public Patient selectByID(int id);
	
	//医生信息
	public boolean insertDoctor(Doctor doctor);
	public Doctor selectDorById(int id);
	public List<Doctor> selectAllDoctor();
	public boolean updateDoctor(Doctor doctor);
	public boolean deleteDor(int id);
	//科室信息
	public boolean addDepartment(Department department);
	public boolean updateDEPART(Department department);
	public List<Department> selectAllDer();
	
	public List<DoctorWithDepart> selectDeDor(int id);
	//收费项目
	public boolean addPay(Pay pay);
	public boolean deletePay(int id);
	public List<Pay> selectAllpay();
	public Pay selectPayById(int id);
	public boolean updatePay(Pay pay);
	
	//药品信息
	public List<Medicine> selectAllMe();
	public boolean updateMeNumber(Medicine medicine);
	public Medicine selectMeById(int id);
	public boolean addMedicine(Medicine medicine);
	
	//治疗之后的单据信息
	public List<Treatment> selectTreatById(int id);
	public List<Treatment> selectAllTreat();
	public boolean updateTreat(int id);
	public List<Treatment> selectEmptyTreat();
	public List<Treatment> selectTreatByTime(String createTime);
	
	
	public int login(User user);
	public boolean regist(User user);
}
