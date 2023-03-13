Pod::Spec.new do |s|
    s.name             = 'atomik'
    s.version          = '1.0'
    s.summary          = 'Summary'
    s.description      = 'Description that is longer'
    s.homepage         = 'Link to a Kotlin/Native module homepage'
    s.license          = { :type => 'MIT', :file => 'LICENSE' }
    s.author           = { 'Kevin Schildhorn' => 'Kevin Schildhorn' }   
    s.ios.deployment_target = '10.0'
    s.source_files     = 'Atomik/*'
    s.source           = { :git => 'https://github.com/KevinSchildhorn/Atomik.git', :tag => 'v1.0' }
 end
 