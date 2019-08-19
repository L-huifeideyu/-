import Axios from 'axios'
import Config from '../config/app.js'
import {Notification, Loading} from 'element-ui';
import {getToken, removeToken} from '../utils/dataStorage.js'
import Qs from "qs"

const service = Axios.create({
    baseURL: Config.apiUrl + '/' + Config.apiPrefix,
    // headers: {
    //     'Accept': '*/*'
    // },
    timeout: Config.timeout,
    //headers:{'Content-Type':"application/x-www-form-urlencoded"}
})
//service.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
service.defaults.retry = Config.requestRetry;
service.defaults.retryDelay = Config.requestRetryDelay;
var loading
service.interceptors.request.use(function (config) {
    // 在发送请求之前做些什么

    config.data = Qs.stringify(config.data)
    loading = Loading.service({
        text: "加载中，请稍后！",
        spinner: 'el-icon-loading',
        background: 'rgba(0, 0, 0, 0.7)'
    })
    return config;
}, function (error) {
    // 对请求错误做些什么
    return Promise.reject(error);
});

// 添加响应拦截器
service.interceptors.response.use(function (response) {

    // 对响应数据做点什么

    loading.close()
    if(response.data.status == "400"){
        Notification({
            title:response.data.msg,
            type:"warning",
            duration:1000
        })
    }
    return response.data;
}, function (error) {
    // 对响应错误做点什么
    return Promise.reject(error);
});

export default service
