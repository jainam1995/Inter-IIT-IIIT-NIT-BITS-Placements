
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EmptyStackException;
import java.util.Stack;
import javax.swing.SwingUtilities;

public class Calculator extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;

    public Calculator() {
        startParts();
    }
    
    private void startParts() {

        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but0 = new javax.swing.JButton();
        butPlus = new javax.swing.JButton();
        butMinus = new javax.swing.JButton();
        butMul = new javax.swing.JButton();
        butEq = new javax.swing.JButton();
        butDiv = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        but5.setText("5");
        but5.setFocusable(false);

        but6.setText("6");
        but6.setFocusable(false);

        but8.setText("8");
        but8.setFocusable(false);

        but7.setText("7");
        but7.setFocusable(false);
        but7.setRequestFocusEnabled(false);

        but1.setText("1");
        but1.setFocusable(false);

        but9.setText("9");
        but9.setFocusable(false);

        but3.setText("3");
        but3.setFocusable(false);

        but2.setText("2");
        but2.setFocusable(false);

        but0.setText("0");
        but0.setFocusable(false);

        butPlus.setText("+");
        butPlus.setFocusable(false);

        butMinus.setText("-");
        butMinus.setFocusable(false);

        butMul.setText("*");
        butMul.setFocusable(false);

        butEq.setText("=");

        butDiv.setText("/");
        butDiv.setFocusable(false);

        but4.setText("4");
        but4.setFocusable(false);

        result.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        result.setText("0");
        result.setToolTipText("");
        result.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but0, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butEq, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(butMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(result)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(butMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butMul, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butEq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );

        pack();
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        final Calculator c1 = new Calculator();
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                c1.setVisible(true);
            }
        });
        
        
        Thread t1;
        t1 = new Thread(new Runnable()
        {
            
            public void run()
            {
               start();
               while(true)
               {
                   if(getpos()==0)
                   {
                    SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but0.setBackground(Color.red);
                       but9.setBackground(null);
                        }
                       });
                   
                   }
                   else if(getpos()==1)
                   {
                    SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but1.setBackground(Color.red);
                       but0.setBackground(null);
                        }
                    });
                        }
                   else if(getpos()==2)
                   {
                       SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {                                            
                       but2.setBackground(Color.red);
                       but1.setBackground(null);
                        }
                       });
                   }
                   else if(getpos()==3)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but3.setBackground(Color.red);
                       but2.setBackground(null);
                        }
                   });
                   }
                   else if(getpos()==4)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but4.setBackground(Color.red);
                       but3.setBackground(null);
                   }
                   });
                   }
                   else if(getpos()==5)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but5.setBackground(Color.red);
                       but4.setBackground(null);
                   }
                   });
                   }
                   else if(getpos()==6)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but6.setBackground(Color.red);
                       but5.setBackground(null);
                        }
                        });
                   
                   }
                   else if(getpos()==7)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but7.setBackground(Color.red);
                       but6.setBackground(null);
                   }
                   });
                   }
                   else if(getpos()==8)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but8.setBackground(Color.red);
                       but7.setBackground(null);
                        }
                   });
                           }
                   else if(getpos()==9)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       but9.setBackground(Color.red);
                       but8.setBackground(null);
                   }                      
                   });
                   }
                   try {
                        Thread.sleep(1500);
                        }
                   catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
			}
                setpos( (getpos() + 1)%10);
               }
               
            }
        });
        
        Thread t2;
        t2 = new Thread(new Runnable()
        {
            
            public void run()
            {
               while(true)
               {
                 if(getposright()==0)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       butPlus.setBackground(Color.yellow);
                       butEq.setBackground(null);
                   }
                   });
                   }
                 if(getposright()==1)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       butMinus.setBackground(Color.yellow);
                       butPlus.setBackground(null);
                       
                   }
                   });}
                 if(getposright()==2)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       butMul.setBackground(Color.yellow);
                       butMinus.setBackground(null);
                   }
                   });}
                 if(getposright()==3)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       butDiv.setBackground(Color.yellow);
                       butMul.setBackground(null);
                   }});}
                 if(getposright()==4)
                   {SwingUtilities.invokeLater(new Runnable() {
			
                        public void run() {
                       butEq.setBackground(Color.yellow);
                       butDiv.setBackground(null);
                   }});
                    }
                try {
                        Thread.sleep(1500);
                        }
                   catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
			}
                setposright( (getposright() + 1)%5);
               }
                
               }
            });
                t1.start();
                t2.start();
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton but0;
    private static javax.swing.JButton but1;
    private static javax.swing.JButton but2;
    private static javax.swing.JButton but3;
    private static javax.swing.JButton but4;
    private static javax.swing.JButton but5;
    private static javax.swing.JButton but6;
    private static javax.swing.JButton but7;
    private static javax.swing.JButton but8;
    private static javax.swing.JButton but9;
    private static javax.swing.JButton butDiv;
    private static javax.swing.JButton butEq;
    private static javax.swing.JButton butMinus;
    private static javax.swing.JButton butMul;
    private static javax.swing.JButton butPlus;
    private static javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
  
    private static volatile String shownContent = "";
    private static Object lock1 = new Object();
    
    private static synchronized String getstring()
    {
        synchronized (lock1){return shownContent;}
    }
    
    private static synchronized void setstring(String str)
    {
        synchronized(lock1){shownContent = str;}
    }
    
    
    private static int pos;
    private static int posright;
    private static char[] mapping = {'+', '-', '*', '/','='};
    
    public static boolean isoperator(char ch)
    {
        if(ch=='+' || ch == '-' || ch== '*' || ch=='/')
            return true;
        return false;
    }
    
    public static String compute_answer(String content)
    {
     System.out.println("Calculating Expression: " + content);
        Stack<Character> s = new Stack<Character>();
        Stack<Integer> s1 = new Stack<Integer>();
        Integer num1, num2;
        String postfix = "";
        for(int i=0;i<content.length();)
        {
            if(content.charAt(i) >= '0' && content.charAt(i) <= '9')
            {
                String temp ="";
                while(i < content.length() && (content.charAt(i) >= '0' && content.charAt(i) <= '9'))
                    temp += content.charAt(i++);
                s1.push(Integer.valueOf(temp));
                postfix += temp;
            }
            else if(content.charAt(i) == '+' || content.charAt(i) == '-')
            {
                
                while(!s.empty())
                {
                    try
                    {
                        num2 = s1.pop();
                        num1= s1.pop();
                    }
                    catch (EmptyStackException e)
                    {
                        return null;
                    }
                    switch(s.peek())
                    {
                        case '+' :  s1.push(num1+num2);
                                    break;
                        case '-' :  s1.push(num1-num2);
                                    break;
                        case '*' :  s1.push(num1*num2);
                                    break;
                        case '/' :  s1.push(num1/num2);
                                    break;
                    }
                    postfix += s.peek();
                    s.pop();
                }
                s.push(content.charAt(i++));
            }
            else if(content.charAt(i) == '*' || content.charAt(i) == '/')
                s.push(content.charAt(i++));
        }
        while(!s.empty())
        {
            try
            {
                num2 = s1.pop();
                num1= s1.pop();
            }
            catch (EmptyStackException e)
            {
                return null;
            }
            switch(s.peek())
            {
                case '+' :  s1.push(num1+num2);
                            break;
                case '-' :  s1.push(num1-num2);
                            break;
                case '*' :  s1.push(num1*num2);
                            break;
                case '/' :  s1.push(num1/num2);
                            break;
            }
            postfix += s.peek();
            s.pop();
        }
        System.out.println(postfix);
        try
        {
            Integer out = s1.pop();
            if(!s1.empty())
                return null;
            return String.valueOf(out);
        }
        catch(EmptyStackException e)
        {
            return null;
        }
    }

    public static int getpos()
    {
        return pos;
    }
    public static int getposright()
    {
        return posright;
    }
    public static void setpos(int k)
    {
        pos = k;
    }
    public static void setposright(int k)
    {
        posright = k;
    }
    
    
    public static void start()
    {
        butEq.requestFocus();
        butEq.addKeyListener(new KeyListener() {

      /** Handle the key typed event from the text field. */
      public void keyTyped(KeyEvent e) {
        //displayInfo(e, "KEY TYPED: ");
      }

      /** Handle the key pressed event from the text field. */
      public void keyPressed(KeyEvent e) {
        //displayInfo(e, "KEY PRESSED: ");
        int keys= e.getKeyCode();
         if(keys==KeyEvent.VK_ENTER)
            {
               // System.out.println(getpos());
                setstring(getstring() +getpos());
                System.out.println(getstring());
                result.setText(getstring());
            }
            if(keys==KeyEvent.VK_SPACE)
            {
                System.out.println(mapping[getposright()]);
                if(getstring() == "")
                   result.setText("Enter Digits");
                
                
                else if( mapping[getposright()] == '=')
                {
                    if(getstring() == "")
                        result.setText("EMPTY STRING");
                    else if(isoperator(getstring().charAt(getstring().length()-1)))
                    {
                        result.setText(shownContent);
                        System.out.println("Invalid string");
                    }
                    else
                    {
                        setstring(compute_answer(getstring()));
                        result.setText(getstring());
                    }
                }
                
                else if(isoperator(getstring().charAt(getstring().length()-1)))
                {
                    setstring( getstring().substring(0,getstring().length()-1) + mapping[getposright()]);                    
                    System.out.println(getstring());
                    result.setText(getstring());
                }                                     
                else
                {
                    setstring(getstring() + mapping[getposright()]);
                    result.setText(getstring());
                }                         
            }
      }

      /** Handle the key released event from the text field. */
      public void keyReleased(KeyEvent e) {
        //displayInfo(e, "KEY RELEASED: ");
      }
        });
    }
   
}
