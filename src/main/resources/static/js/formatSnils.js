//
////Код jQuery, установливающий маску для ввода телефона элементу input
////1. После загрузки страницы,  когда все элементы будут доступны выполнить...
//$(function(){
//  //2. Получить элемент, к которому необходимо добавить маску
//  $.mask.definitions['9'] = false;
//  $.mask.definitions['9'] = "[0-9]";
//  $("#snils").mask("999-999-999 99");
//});
var telInp = $('input[type="text"]');

telInp.each(function(){
  $(this).mask("999-999-999 99");
});

$.fn.setCursorPosition = function(pos) {
  if ($(this).get(0).setSelectionRange) {
    $(this).get(0).setSelectionRange(pos, pos);
  } else if ($(this).get(0).createTextRange) {
    var range = $(this).get(0).createTextRange();
    range.collapse(true);
    range.moveEnd('character', pos);
    range.moveStart('character', pos);
    range.select();
  }
};
$('input[type="text"]').click(function(){
    $(this).setCursorPosition(0);  // set position number
  });