import request from '@/utils/request'

// 查询覆盖率项目列表
export function listProject(query) {
  return request({
    url: '/jacoco/project/list',
    method: 'get',
    params: query
  })
}

// 查询覆盖率项目详细
export function getProject(id) {
  return request({
    url: '/jacoco/project/' + id,
    method: 'get'
  })
}

// 新增覆盖率项目
export function addProject(data) {
  return request({
    url: '/jacoco/project',
    method: 'post',
    data: data
  })
}

// 修改覆盖率项目
export function updateProject(data) {
  return request({
    url: '/jacoco/project',
    method: 'put',
    data: data
  })
}

// 删除覆盖率项目
export function delProject(id) {
  return request({
    url: '/jacoco/project/' + id,
    method: 'delete'
  })
}

// 导出覆盖率项目
export function exportProject(query) {
  return request({
    url: '/jacoco/project/export',
    method: 'get',
    params: query
  })
}