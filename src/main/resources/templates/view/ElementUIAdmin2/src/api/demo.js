import request from '../utils/request.js'

export function login(params) {
  return request({
    url: '/login',
    method: 'post',
    data: params
  })
}

export function sendSMS(params) {
  return request({
    closeLoading:true,//closeInterceptors:true  (请求没有Loading，请求没有拦截)
    url: '/pc/sendsms',
    method: 'get',
    params: params
  })
}
export function test(params) {
  return request({
    url: '/testBoot/getUser',
    method: 'GET',
    params: params
  })
}