package Fixut.Services;

import Fixut.Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceFacade {

    @Autowired
    protected Dao dao;

    @Autowired
    private Environment env;

//    @Autowired
//    private EmailSender mailSender;

    @Autowired
    private TaskExecutor taskExecutor;

//    @Transactional
//    public GetProjectTasksOutput getProjectTasks(GetProjectTasksInput input) {
//        GetProjectTasksHelper helper = new GetProjectTasksHelper(dao, input);
//        return (GetProjectTasksOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetGroupUserTasksOutput getGroupProjectTasks(GetGroupUserTasksInput input) {
//        GetGroupUserTasksHelper helper = new GetGroupUserTasksHelper(dao, input);
//        return (GetGroupUserTasksOutput) helper.execute();
//    }
//
//
//    @Transactional
//    public GetVersionsOutput getProjectVersions(GetVersionsInput input) {
//        GetVersionsHelper helper = new GetVersionsHelper(dao, input);
//        return (GetVersionsOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetProjectsOutput getProjects(GetProjectsInput input) {
//        GetProjectsHelper helper = new GetProjectsHelper(dao, input);
//        return (GetProjectsOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetGroupsOutput getGroups(GetGroupsInput input) {
//        GetGroupsHelper helper = new GetGroupsHelper(dao, input);
//        return (GetGroupsOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetGroupOutput getGroup(GetGroupInput input) {
//        GetGroupHelper helper = new GetGroupHelper(dao, input);
//        return (GetGroupOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetUserOutput getUser(GetUserInput input) {
//        GetUserHelper helper = new GetUserHelper(dao, input);
//        return (GetUserOutput) helper.execute();
//    }
//
//    @Transactional
//    public SaveUserOutput saveUser(SaveUserInput input) {
//        SaveUserHelper helper = new SaveUserHelper(dao, input);
//        return (SaveUserOutput) helper.execute();
//    }
//
//    @Transactional
//    public SaveGroupOutput saveGroup(SaveGroupInput input) {
//        SaveGroupHelper helper = new SaveGroupHelper(dao, input);
//        return (SaveGroupOutput) helper.execute();
//    }
//
//    @Transactional
//    public SaveProjectOutput saveProject(SaveProjectInput input) {
//        SaveProjectHelper helper = new SaveProjectHelper(dao, input);
//        return (SaveProjectOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetTaskOutput getTask(GetTaskInput input) {
//        GetTaskHelper helper = new GetTaskHelper(dao, input);
//        return (GetTaskOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetVersionOutput getVersion(GetVersionInput input) {
//        GetVersionHelper helper = new GetVersionHelper(dao, input);
//        return (GetVersionOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetProjectOutput getProject(GetProjectInput input) {
//        GetProjectHelper helper = new GetProjectHelper(dao, input);
//        return (GetProjectOutput) helper.execute();
//    }
//
//    @Transactional
//    public SaveTaskOutput saveTask(SaveTaskInput input) {
//        SaveTaskHelper helper = new SaveTaskHelper(dao, mailSender, taskExecutor, input);
//        SaveTaskOutput output = (SaveTaskOutput) helper.execute();
//        return output;
//    }
//
//    @Transactional
//    public SaveVersionOutput saveVersion(SaveVersionInput input) {
//        SaveVersionHelper helper = new SaveVersionHelper(dao, input);
//        return (SaveVersionOutput) helper.execute();
//    }
//
//    @Transactional
//    public DeleteTaskOutput deleteTask(DeleteTaskInput input) {
//        DeleteTaskHelper helper = new DeleteTaskHelper(dao, input);
//        return (DeleteTaskOutput) helper.execute();
//    }
//
//    @Transactional
//    public DeleteUserOutput deleteUser(DeleteUserInput input) {
//        DeleteUserHelper helper = new DeleteUserHelper(dao, input);
//        return (DeleteUserOutput) helper.execute();
//    }
//
//    @Transactional
//    public DeleteGroupOutput deleteGroup(DeleteGroupInput input) {
//        DeleteGroupHelper helper = new DeleteGroupHelper(dao, input);
//        return (DeleteGroupOutput) helper.execute();
//    }
//
//    @Transactional
//    public ChangeTaskOrderOutput changeTaskOrder(ChangeTaskOrderInput input) {
//        ChangeTaskOrderHelper helper = new ChangeTaskOrderHelper(dao, input);
//        return (ChangeTaskOrderOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetUsersOutput getUsers(GetUsersInput input) {
//        GetUsersHelper helper = new GetUsersHelper(dao, input);
//        return (GetUsersOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetChangelogOutput getChangelog(GetChangelogInput input) {
//        GetChangelogHelper helper = new GetChangelogHelper(dao, input);
//        return (GetChangelogOutput) helper.execute();
//    }
//
//    @Transactional
//    public AddFileOutput addFile(AddFileInput input) {
//        AddFileHelper helper = new AddFileHelper(dao, input, getDataFolderLocation());
//        return (AddFileOutput) helper.execute();
//    }
//
//    @Transactional
//    public GetFileOutput getFile(GetFileInput input) {
//        GetFileHelper helper = new GetFileHelper(dao, input, getDataFolderLocation());
//        return (GetFileOutput) helper.execute();
//    }
//
//    public String getDataFolderLocation() {
//        return env.getProperty("datafiles.dir");
//    }
}