---------------------
---CHECKLIST GUIDE---
-[X] = DONE. 
-[*] = ALMOST DONE, NEED VERIFY FIELDS/IMPLEMENTATION STUFF.

----------------------

---SESSION AND MESSAGING---
-[X]CurrentSession
-[X]CurrentSessionView
-[X]HSTSMessage
-[]MessageType

---USERS---
-[X]AuthorizedUser
-[]Student
-[X]Teacher
-[]SubjectCoordinator
-[]Principal
-[]ManagementSystem
-[]AuthorizedUserView
-[]StudentView
-[X]TeacherView
-[]SubjectCoordinatorView
-[]PrincipalView
-[]ManagementSystemView

---COURSES AND ENROLLMENT---
-[X]Subject
-[X]SubjectView
-[X]Course
-[X]CourseView
-[X]Enrollment
-[X]EnrollmentView

---QUESTION BANK---
-[X]Question
-[X]TeacherQuestionView
-[X]StudentQuestionView

---EXAMS---
-[X]Exam
-[X]ExamQuestion
-[]ExamInstance
-[]ExamSubmission
-[X]ExamView
-[]ExamQuestionView
-[]ExamInstanceView
-[]ExamSubmissionView
-[]ExamStatus

---STUDY MATERIAL---
-[]StudyMaterial
-[]StudyMaterialView
-[]MaterialType

---STATISTICS---
-[]ExamStatistics
-[]ExamStatisticsView

---SERVER DATABASE AND REPOSITORIES---
-[*]DatabaseManager
-[]UserRepository
-[]CourseRepository
-[X]QuestionRepository
-[]ExamRepository
-[]ExaminationRepository
-[]ExamSubmissionsRepository
-[]StudyMaterialRepository
-[]StatisticsRepository

---SERVER LOGIC---
-[]LoginServerLogic
-[]QuestionBankServerLogic
-[]ExamCreationServerLogic
-[]ExamManagementServerLogic
-[]ExamApprovalServerLogic
-[]ExamExecutionServerLogic
-[]ExamSubmissionManagementServerLogic
-[]StudentResultsServerLogic
-[]TeacherStatisticsServerLogic

---SERVER NETWORK---
-[]SimpleServer
-[]HSTSMessagesServer
-[]EventBus
-[]SimpleClient (server network)
-[X]AbstractServer
-[X]ConnectionToClient
-[X]AbstractConnectionFactory
-[]Server App

---CLIENT LOGIC---
-[]LoginClientLogic
-[]QuestionBankClientLogic
-[]ExamCreationClientLogic
-[]ExamManagementClientLogic
-[]ExamApprovalClientLogic
-[]ExamExecutionClientLogic
-[]ExamSubmissionManagementClientLogic
-[]StudentResultsClientLogic
-[]TeacherStatisticsClientLogic

---CLIENT SCREENS---
-[]LoginScreen
-[]MainMenuScreen
-[]QuestionBankScreen
-[]ExamCreationScreen
-[]ExamManagementScreen
-[]ExamApprovalScreen
-[]ExamExecutionScreen
-[]ExamSubmissionManagementScreen
-[]StudentResultsScreen
-[]TeacherStatisticsScreen

---CLIENT NETWORK AND APPLICATION---
-[]SimpleClient (client network)
-[X]AbstractClient
-[]Client App
-[]Main
