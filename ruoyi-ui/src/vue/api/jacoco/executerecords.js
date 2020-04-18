import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listExecuterecords(query) {
  return request({
    url: '/jacoco/executerecords/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getExecuterecords(id) {
  return request({
    url: '/jacoco/executerecords/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addExecuterecords(data) {
  return request({
    url: '/jacoco/executerecords',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateExecuterecords(data) {
  return request({
    url: '/jacoco/executerecords',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delExecuterecords(id) {
  return request({
    url: '/jacoco/executerecords/' + id,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportExecuterecords(query) {
  return request({
    url: '/jacoco/executerecords/export',
    method: 'get',
    params: query
  })
}