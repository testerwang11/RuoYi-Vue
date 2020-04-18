<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" label-width="68px">
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="projectname">
        <el-input
          v-model="queryParams.projectname"
          placeholder="请输入和当前版本对比的分支，生成增量测试报告用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="codebranch">
        <el-input
          v-model="queryParams.codebranch"
          placeholder="请输入和当前版本对比的分支，生成增量测试报告用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="diffurl">
        <el-input
          v-model="queryParams.diffurl"
          placeholder="请输入和当前版本对比的分支，生成增量测试报告用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="executetime">
        <el-date-picker clearable size="small" style="width: 200px"
          v-model="queryParams.executetime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择和当前版本对比的分支，生成增量测试报告用">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="serverip">
        <el-input
          v-model="queryParams.serverip"
          placeholder="请输入和当前版本对比的分支，生成增量测试报告用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="reportpath">
        <el-input
          v-model="queryParams.reportpath"
          placeholder="请输入和当前版本对比的分支，生成增量测试报告用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['jacoco:executerecords:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['jacoco:executerecords:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['jacoco:executerecords:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['jacoco:executerecords:export']"
        >导出</el-button>
      </el-col>
    </el-row>

    <el-table v-loading="loading" :data="executerecordsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="id" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="projectname" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="codebranch" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="diffurl" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="executetime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.executetime) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="serverip" />
      <el-table-column label="和当前版本对比的分支，生成增量测试报告用" align="center" prop="reportpath" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['jacoco:executerecords:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['jacoco:executerecords:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px">
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="projectname">
          <el-input v-model="form.projectname" placeholder="请输入和当前版本对比的分支，生成增量测试报告用" />
        </el-form-item>
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="codebranch">
          <el-input v-model="form.codebranch" placeholder="请输入和当前版本对比的分支，生成增量测试报告用" />
        </el-form-item>
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="diffurl">
          <el-input v-model="form.diffurl" placeholder="请输入和当前版本对比的分支，生成增量测试报告用" />
        </el-form-item>
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="executetime">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="form.executetime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择和当前版本对比的分支，生成增量测试报告用">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="serverip">
          <el-input v-model="form.serverip" placeholder="请输入和当前版本对比的分支，生成增量测试报告用" />
        </el-form-item>
        <el-form-item label="和当前版本对比的分支，生成增量测试报告用" prop="reportpath">
          <el-input v-model="form.reportpath" placeholder="请输入和当前版本对比的分支，生成增量测试报告用" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listExecuterecords, getExecuterecords, delExecuterecords, addExecuterecords, updateExecuterecords, exportExecuterecords } from "@/api/jacoco/executerecords";

export default {
  name: "Executerecords",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      executerecordsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        projectname: undefined,
        codebranch: undefined,
        diffurl: undefined,
        executetime: undefined,
        serverip: undefined,
        reportpath: undefined
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listExecuterecords(this.queryParams).then(response => {
        this.executerecordsList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: undefined,
        projectname: undefined,
        codebranch: undefined,
        diffurl: undefined,
        executetime: undefined,
        serverip: undefined,
        reportpath: undefined
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!=1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getExecuterecords(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm: function() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != undefined) {
            updateExecuterecords(this.form).then(response => {
              if (response.code === 200) {
                this.msgSuccess("修改成功");
                this.open = false;
                this.getList();
              } else {
                this.msgError(response.msg);
              }
            });
          } else {
            addExecuterecords(this.form).then(response => {
              if (response.code === 200) {
                this.msgSuccess("新增成功");
                this.open = false;
                this.getList();
              } else {
                this.msgError(response.msg);
              }
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$confirm('是否确认删除【请填写功能名称】编号为"' + ids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delExecuterecords(ids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        }).catch(function() {});
    },
    /** 导出按钮操作 */
    handleExport() {
      const queryParams = this.queryParams;
      this.$confirm('是否确认导出所有【请填写功能名称】数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return exportExecuterecords(queryParams);
        }).then(response => {
          this.download(response.msg);
        }).catch(function() {});
    }
  }
};
</script>