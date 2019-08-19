import request from '../utils/request.js'

export function login(params) {
  return request({
    url: '/login',
    method: 'post',
    data: params
  })
}

export function getUserList(params) {
  return request({
    url: '/sys/userList',
    method: 'GET',
    params: params
  })
}