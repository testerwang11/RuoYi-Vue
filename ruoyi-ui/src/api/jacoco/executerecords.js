import request from '@/utils/request'

// 查询覆盖率拉取记录列表
export function listExecuterecords(query) {
  return request({
    url: '/jacoco/executerecords/list',
    method: 'get',
    params: query
  })
}

// 查询覆盖率拉取记录详细
export function getExecuterecords(id) {
  return request({
    url: '/jacoco/executerecords/' + id,
    method: 'get'
  })
}

// 新增覆盖率拉取记录
export function addExecuterecords(data) {
  return request({
    url: '/jacoco/executerecords',
    method: 'post',
    data: data
  })
}

// 修改覆盖率拉取记录
export function updateExecuterecords(data) {
  return request({
    url: '/jacoco/executerecords',
    method: 'put',
    data: data
  })
}

// 删除覆盖率拉取记录
export function delExecuterecords(id) {
  return request({
    url: '/jacoco/executerecords/' + id,
    method: 'delete'
  })
}

// 导出覆盖率拉取记录
export function exportExecuterecords(query) {
  return request({
    url: '/jacoco/executerecords/export',
    method: 'get',
    params: query
  })
}