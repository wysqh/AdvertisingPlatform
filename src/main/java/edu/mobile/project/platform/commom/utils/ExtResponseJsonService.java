package edu.mobile.project.platform.commom.utils;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回json数据进行封装
 * @author QIQI
 */
@Service
public class ExtResponseJsonService {

	public Map<String, Object> responseListMap(List list) {
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("total", list.size());
		modelMap.put("data", list);
		modelMap.put("success", true);
		return modelMap;
	}
	
	public Map<String, Object> responseObjectMap(Object o) {
		Map<String, Object> modelMap = new HashMap<String, Object>(2);
		modelMap.put("data", o);
		modelMap.put("success", true);
		return modelMap;
	}

	public Map<String, Object> responseListMap(List list, int totalCount) {
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
		modelMap.put("total", totalCount);
		modelMap.put("size", list.size());
		modelMap.put("data", list);
		modelMap.put("success", true);
		return modelMap;
	}

	public Map<String, Object> responseError(String msg) {

		Map<String, Object> modelMap = new HashMap<String, Object>(2);
		modelMap.put("message", msg);
		modelMap.put("success", false);
		return modelMap;
	}

	public Map<String, Object> responseSuccess(String msg){
		Map<String, Object> modelMap = new HashMap<String, Object>(2);
		modelMap.put("message", msg);
		modelMap.put("success", true);
		return modelMap;
	}
	
	public Map<String, Object> responseDateError(String msg, Date importTime){
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("message", msg);
		modelMap.put("success", false);
		modelMap.put("importTime", importTime);
		return modelMap;
	}
	
	public Map<String, Object> responseDateSuccess(String msg, Date importTime){
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("message", msg);
		modelMap.put("success", true);
		modelMap.put("importTime", importTime);
		return modelMap;
	}
}
