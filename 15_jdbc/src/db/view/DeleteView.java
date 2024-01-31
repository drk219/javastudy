package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DeleteView implements View {

  @Override
  public UserDto display() {
    
    String user_no = JOptionPane.showInputDialog("삭제할 사용자의 번호를 입력하세요.");
    if(JOptionPane.showConfirmDialog(null, "정말 삭제할까요?") != JOptionPane.OK_OPTION) {
      return new UserDto(-1, null, null, null);  // -1 번 사용자는 없으므로 삭제를 막게끔 설정
    }
    
    return new UserDto(Integer.parseInt(user_no), null, null, null);
  }

}
