package edu.mobile.project.platform.commom;

/**
 * @author duhw
 * @ClassName: ConstUtil
 * @ClassNameExplain: 类名说明
 * @Description: TODO(这里描述这个类的作用)
 * @date 2016年4月11日 下午2:13:38
 */
public class ConstUtil {
    //服务器配置地址常量
    //------------------------------部署之前必须修改------------------------------------
    public static final String LOCAL_STORAGE_PATH = "E:/Project_Resources/duanzu/";
    public static final String PIC_ADDRESS = "file/userImage/";
    public static final String FILE_ADDRESS = "file/userFile/";
    public static final String FILE_SERVER_ADDRESS = "http://120.77.212.147:8080/file/userUpload/";
    public static final String FILE_LOCAL_ADDRESS = "C:/file/userUpload/";

    public static final String TONGLIAN_PAY_ACCOUNT = "200465000002291";        //通联商户Id


    //融云配置常量
    public static final String appKey = "uwd1c0sxuwtw1";//替换成您的appkey
    public static final String appSecret = "hGzQL3hSEi";//替换成匹配上面key的secret
    //接口地址常量
    public static final String APP_INTERFACE = "/app";
    public static final String USER_INTERFACE = APP_INTERFACE + "/user";
    public static final String USER_LOGIN = "/usersLogin";
    public static final String USER_REGIST = "/usersRegist";
    public static final String GOODS_INTERFACE = APP_INTERFACE + "/goods";
    public static final String SEARCH_FOR_GOODS = "/searchForGoods";
    public static final String GOODS_DETAIL = "/getGoodsDetails";
    public static final String RECOMMEND_GOODS = "/getRecommendGoods";
    public static final String COMPARE_INTERFACE = APP_INTERFACE + "/compare";
    public static final String COMPARE_WITH_STANDARD = "/compareWithStandard";
    public static final String CURVE_INTERFACE = APP_INTERFACE + "/curve";
    public static final String ADD_USER_CURVE_DATA = "/addUserCurveData";
    public static final String GET_CURVE_DATA = "/getCurveDataUrlByGoodsId";
    public static final String FILE_INTERFACE = APP_INTERFACE + "/file";
    public static final String GOODS_PICTURE_UPLOAD = "/goodsPicture";
    public static final String DICTIONARY_INTERFACE = APP_INTERFACE + "/dictionary";
    public static final String GET_UPDATED_GOODS_CATEGORY_DICTIONARY = "/getUpdatedGoodsDictionaryCategoryDictionary";
    //管理地址常量
    public static final String ADMIN_INTERFACE = "/admin";
    public static final String MANAGER_INTERFACE = ADMIN_INTERFACE + "/manager";
    public static final String MANAGER_LOGIN = "/login";
    public static final String SYSTEM_INTERFACE = ADMIN_INTERFACE + "/system";
    public static final String SYSTEM_LOG_PAGE = "/getSystemLogPage";
    public static final String MANAGE_GOODS_INTERFACE = ADMIN_INTERFACE + "/goods";
    public static final String MANAGE_GOODS_INFO_LIST = "/goodsInfoList";
    public static final String MANAGE_GOODS_INFO = "/getGoodsInfo";
    public static final String MANAGE_UPDATE_GOODS_INFO = "/updateGoodsInfo";
    public static final String MANAGE_DICTIONARY_INTERFACE = ADMIN_INTERFACE + "/dictionary";
    public static final String MANAGE_GOODS_INFO_DICTIONARY = "/getGoodsInfoDictionary";
    public static final String MANAGE_COMPANY_INTERFACE = ADMIN_INTERFACE + "/company";
    public static final String MANAGE_COMPANY_SELECT_LIST = "/getCompanySelectList";
    //session信息常量
    public static final String SESSION_USER_INFO = "userInfo";
    //数据库通用字段常量
    public static final String DB_ID = "id";
    public static final String QUERY_NOT_DELETED = " and isDeleted = 0";
    public static final String IS_DELETED = "isDeleted";
    public static final Integer NOT_DELETED = 0;
    public static final Integer DELETED = 1;
    //视图常量
    public static final String DB_V_GOODS_SEARCH_RESULT_NAME = "id.dicName";
    public static final String DB_V_GOODS_DETAIL_ID = "id.id";
    public static final String DB_V_GOODS_DETAIL_DICTNAME = "id.goodsType";
    public static final String DV_V_COMPARE_TIMES = "id.compareTimes";
    //User表常量
    public static final String DB_USERS_LOGINNAME = "loginName";
    public static final String DB_USERS_PASSWORD = "password";
    public static final String DB_USERS_PHONENO = "phone";
    //Manager表常量
    public static final String DB_MANAGER_LOGINNAME = "loginName";
    public static final String DB_MANAGER_PASSWORD = "password";
    //SpecialistLines表常量
    public static final String DB_SPECIALIST_LINES_GOODS_ID = "goodsInfo.id";
    public static final String DB_SPECIALIST_LINES_DEVICE_TYPE = "deviceType";
    //UserLines表常量
    public static final String DB_USER_LINES_POSITIVE_COMMENT = "positiveComment";
    public static final String DB_USER_LINES_GOODS_ID = "goodsInfo.id";
    public static final String DB_USER_LINES_DEVICE_TYPE = "deviceType";
    //Company表常量
    public static final String DB_COMPANY_NAME = "companyName";
    //Dictionary表常量
    public static final String DB_DICT_CODE = "dicCode";
    public static final String DB_PARENT_CODE = "parentCode";
    public static final String DB_VERSION = "version";
    //数学常量
    public static final Long TIME_DAY = 24 * 60 * 60 * 1000L;
    public static final Long TIME_WEEK = 7 * 24 * 60 * 60 * 1000L;
    public static final Long TIME_HOUR = 60 * 60 * 1000L;
    //字典常量
    public static final String NORMAL_ACCOUNT = "01010201";
    public static final String STATUS_AVAILABLE = "01010100";
    public static final String DEFAULT_DEVICE_TYPE = "02010100";
    //其他常量
    public static final String DEFULT_PORTRAIT = "http://s16.sinaimg.cn/mw690/003gRgrCzy73OGZAV434f&690";
    //返回消息常量
    public static String LOGIN_SUCCESS = "登录成功";
    public static String LOGIN_WRONG_PASSWORD = "账号/密码错误";
    public static String HAVE_REGISTED = "手机号已被注册";
    public static String INVALID = "账号不合法";
    public static String REGIST_SUCCESS = "注册成功";
    public static String FILE_UPLOAD_NULL = "上传文件为空";
    public static String FILE_UPLOAD_SUCCESS = "上传文件成功";
    public static String DATA_INVALID = "上传文件不合法";
    public static String UPLOAD_USERLINE_SUCCESS = "上传曲线成功";
    public static String NO_GOODS_LINES = "没有当前文件的曲线";
    public static String UPDATE_SUCCESS = "更新成功";
    public static String UPDATE_FAILED = "更新失败，参数不合法";
    //特殊含义常量
    public static String NO_COMPANY_PHONE = "";//厂家没有电话;
    public static String NO_COMPANY_ADDRESS = "";//厂家没有地址;
    public static String DEFAULT_COMPANY = "未知";
    public static String NO_ATTENTION = "无";//没有注意事项
}
